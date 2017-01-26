package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_80 {
    private final Production85_80 production = new Production85_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}