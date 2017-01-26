package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_78 {
    private final Production85_78 production = new Production85_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}