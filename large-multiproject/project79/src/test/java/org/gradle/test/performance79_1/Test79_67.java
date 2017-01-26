package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_67 {
    private final Production79_67 production = new Production79_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}