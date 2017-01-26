package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_145 {
    private final Production78_145 production = new Production78_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}