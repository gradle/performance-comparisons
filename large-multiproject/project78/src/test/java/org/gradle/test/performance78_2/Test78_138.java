package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_138 {
    private final Production78_138 production = new Production78_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}