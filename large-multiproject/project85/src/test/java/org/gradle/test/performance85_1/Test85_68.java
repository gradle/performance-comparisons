package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_68 {
    private final Production85_68 production = new Production85_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}