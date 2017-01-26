package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_75 {
    private final Production78_75 production = new Production78_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}