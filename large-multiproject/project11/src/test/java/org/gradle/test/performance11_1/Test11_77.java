package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_77 {
    private final Production11_77 production = new Production11_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}