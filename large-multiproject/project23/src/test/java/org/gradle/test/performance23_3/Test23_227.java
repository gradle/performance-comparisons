package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_227 {
    private final Production23_227 production = new Production23_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}