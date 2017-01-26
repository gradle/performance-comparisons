package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_356 {
    private final Production85_356 production = new Production85_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}