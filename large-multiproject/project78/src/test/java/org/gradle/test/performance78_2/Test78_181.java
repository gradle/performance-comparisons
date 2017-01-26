package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_181 {
    private final Production78_181 production = new Production78_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}