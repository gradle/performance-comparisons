package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_40 {
    private final Production85_40 production = new Production85_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}