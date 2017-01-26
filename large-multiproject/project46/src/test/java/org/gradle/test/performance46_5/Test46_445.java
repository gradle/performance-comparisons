package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_445 {
    private final Production46_445 production = new Production46_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}