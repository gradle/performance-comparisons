package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_282 {
    private final Production79_282 production = new Production79_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}