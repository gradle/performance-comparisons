package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_212 {
    private final Production23_212 production = new Production23_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}