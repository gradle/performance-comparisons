package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_228 {
    private final Production79_228 production = new Production79_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}