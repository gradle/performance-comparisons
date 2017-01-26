package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_442 {
    private final Production78_442 production = new Production78_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}