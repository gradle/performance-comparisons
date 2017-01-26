package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_100 {
    private final Production11_100 production = new Production11_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}