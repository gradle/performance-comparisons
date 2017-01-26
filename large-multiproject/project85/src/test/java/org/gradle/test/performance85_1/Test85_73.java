package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_73 {
    private final Production85_73 production = new Production85_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}