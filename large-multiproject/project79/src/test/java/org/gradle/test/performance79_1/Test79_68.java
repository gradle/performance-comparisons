package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_68 {
    private final Production79_68 production = new Production79_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}