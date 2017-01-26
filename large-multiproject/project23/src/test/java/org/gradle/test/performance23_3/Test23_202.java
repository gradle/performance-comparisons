package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_202 {
    private final Production23_202 production = new Production23_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}