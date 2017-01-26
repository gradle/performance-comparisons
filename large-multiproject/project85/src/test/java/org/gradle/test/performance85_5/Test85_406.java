package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_406 {
    private final Production85_406 production = new Production85_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}