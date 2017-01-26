package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_212 {
    private final Production78_212 production = new Production78_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}