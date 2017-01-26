package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_267 {
    private final Production85_267 production = new Production85_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}