package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_362 {
    private final Production23_362 production = new Production23_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}