package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_174 {
    private final Production78_174 production = new Production78_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}