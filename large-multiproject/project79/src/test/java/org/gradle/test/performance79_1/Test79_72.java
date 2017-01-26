package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_72 {
    private final Production79_72 production = new Production79_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}