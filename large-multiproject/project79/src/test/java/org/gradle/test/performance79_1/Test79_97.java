package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_97 {
    private final Production79_97 production = new Production79_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}