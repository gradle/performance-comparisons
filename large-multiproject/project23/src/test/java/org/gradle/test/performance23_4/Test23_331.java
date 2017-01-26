package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_331 {
    private final Production23_331 production = new Production23_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}