package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_225 {
    private final Production79_225 production = new Production79_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}