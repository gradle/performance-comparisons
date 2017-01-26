package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_134 {
    private final Production79_134 production = new Production79_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}