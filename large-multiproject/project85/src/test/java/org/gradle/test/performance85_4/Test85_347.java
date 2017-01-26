package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_347 {
    private final Production85_347 production = new Production85_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}