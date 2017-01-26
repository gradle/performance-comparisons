package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_126 {
    private final Production79_126 production = new Production79_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}