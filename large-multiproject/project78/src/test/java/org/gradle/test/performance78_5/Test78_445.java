package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_445 {
    private final Production78_445 production = new Production78_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}