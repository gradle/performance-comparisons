package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_282 {
    private final Production33_282 production = new Production33_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}