package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_27 {
    private final Production85_27 production = new Production85_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}