package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_325 {
    private final Production85_325 production = new Production85_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}