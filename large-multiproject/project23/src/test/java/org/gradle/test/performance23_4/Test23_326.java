package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_326 {
    private final Production23_326 production = new Production23_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}