package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_76 {
    private final Production11_76 production = new Production11_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}