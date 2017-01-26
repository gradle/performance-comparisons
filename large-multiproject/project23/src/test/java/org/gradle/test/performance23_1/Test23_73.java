package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_73 {
    private final Production23_73 production = new Production23_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}