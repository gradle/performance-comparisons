package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_364 {
    private final Production85_364 production = new Production85_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}