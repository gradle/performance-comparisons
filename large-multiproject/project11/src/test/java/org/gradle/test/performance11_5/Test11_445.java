package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_445 {
    private final Production11_445 production = new Production11_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}