package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_293 {
    private final Production11_293 production = new Production11_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}