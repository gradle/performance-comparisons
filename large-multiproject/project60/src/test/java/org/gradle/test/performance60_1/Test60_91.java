package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_91 {
    private final Production60_91 production = new Production60_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}