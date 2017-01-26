package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_255 {
    private final Production11_255 production = new Production11_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}