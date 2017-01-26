package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_27 {
    private final Production79_27 production = new Production79_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}