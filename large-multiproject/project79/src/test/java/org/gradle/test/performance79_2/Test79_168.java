package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_168 {
    private final Production79_168 production = new Production79_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}