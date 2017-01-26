package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_241 {
    private final Production78_241 production = new Production78_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}