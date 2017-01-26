package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_88 {
    private final Production85_88 production = new Production85_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}