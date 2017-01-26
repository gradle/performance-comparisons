package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_41 {
    private final Production79_41 production = new Production79_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}