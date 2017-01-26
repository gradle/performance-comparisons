package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_119 {
    private final Production78_119 production = new Production78_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}