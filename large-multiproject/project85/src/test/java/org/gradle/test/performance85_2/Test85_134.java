package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_134 {
    private final Production85_134 production = new Production85_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}