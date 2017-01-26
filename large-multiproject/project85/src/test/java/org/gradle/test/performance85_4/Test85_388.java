package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_388 {
    private final Production85_388 production = new Production85_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}