package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_119 {
    private final Production79_119 production = new Production79_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}