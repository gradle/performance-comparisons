package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_119 {
    private final Production85_119 production = new Production85_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}