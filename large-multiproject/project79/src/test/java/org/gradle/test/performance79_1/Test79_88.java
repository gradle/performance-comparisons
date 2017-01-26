package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_88 {
    private final Production79_88 production = new Production79_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}