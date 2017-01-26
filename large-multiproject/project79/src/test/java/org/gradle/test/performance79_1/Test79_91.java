package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_91 {
    private final Production79_91 production = new Production79_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}