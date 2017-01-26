package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_58 {
    private final Production79_58 production = new Production79_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}