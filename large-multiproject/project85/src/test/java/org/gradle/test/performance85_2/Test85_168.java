package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_168 {
    private final Production85_168 production = new Production85_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}